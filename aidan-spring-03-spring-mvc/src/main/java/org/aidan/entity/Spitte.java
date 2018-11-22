package org.aidan.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

/**
 * @author Aidan
 * @创建时间：2018/11/13 上午9:21
 * @描述: Spittle
 */
public class Spitte {

    private final Long id;

    private final String message;

    private final Date time;

    private Double latitude;

    private Double longitude;

    public Spitte(String message, Date time) {
        this(message, time, null, null);
    }

    public Spitte(String message, Date time, Double latitude, Double longitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Spitte spittle = (Spitte) o;

        return new EqualsBuilder()
                .append(id, spittle.id)
                .append(time, spittle.time)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(time)
                .toHashCode();
    }
}
