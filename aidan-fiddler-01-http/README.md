spring boot Dockerfile
```
FROM daocloud.io/java:8
ENV JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64 \
        CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar \
        PATH=$JAVA_HOME/bin:$PATH
COPY ./aidan-fiddler-01-http-0.0.1-SNAPSHOT.jar /work/
CMD ["java","-jar","/work/aidan-fiddler-01-http-0.0.1-SNAPSHOT.jar"]
```

```
docker build -t aidan.org/hello:1.0 .
docker run -d --rm -it -p 9090:8080 aidan.org/hello:1.0
```

nginx 反向代理 Dockerfile
```
FROM daocloud.io/nginx
COPY nginx.conf /etc/nginx
```

nginx.conf
```
user  nginx;
worker_processes  1;

error_log  /var/log/nginx/error.log warn;
pid        /var/run/nginx.pid;


events {
    worker_connections  1024;
}


http {
    include       /etc/nginx/mime.types;
    default_type  application/octet-stream;

    log_format  main  '$remote_addr - $remote_user [$time_local] "$request" '
                      '$status $body_bytes_sent "$http_referer" '
                      '"$http_user_agent" "$http_x_forwarded_for"';

    access_log  /var/log/nginx/access.log  main;

    sendfile        on;
    #tcp_nopush     on;

    keepalive_timeout  65;

    #gzip  on;

    upstream hello {
        server 172.16.0.60:9090;
    }
    server{

        listen 80;
        server_name localhost;
        location / {
            root /usr/share/nginx/html;
            index index.html;
        }
        location ^~ /hello {
            proxy_pass http://hello;
        }
    }
}
```

```
docker build -t aidan.org/mynginx:1.0 .
docker run -d --rm -it -p 80:80 -v ~/html:/usr/share/nginx/html aidan.org/mynginx:1.0
```