package org.aidan.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Aidan
 * @创建时间：2018/11/14 下午5:32
 * @描述: Spittler
 */
public class Spitter {

    private Long id;

    /**
     * 非空，5到16个字符
     */
    @NotBlank
    @Size(min = 5, max = 6)
    private String username;

    /**
     * 非空，5到25个字符
     */
    @NotNull
    @Size(min = 5, max = 25)
    private String password;

    /**
     * 非空，2到30个字符
     */
    @NotNull
    @Size(min = 2, max = 30)
    private String firstName;

    /**
     * 非空，2到30个字符
     */
    @NotNull
    @Size(min = 2, max = 30)
    private String lastName;

    public Spitter() {
    }

    public Spitter(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Spitter(Long id, String username, String password, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Spitter spitter = (Spitter) o;

        return new EqualsBuilder()
                .append(username, spitter.username)
                .append(password, spitter.password)
                .append(firstName, spitter.firstName)
                .append(lastName, spitter.lastName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(username)
                .append(password)
                .append(firstName)
                .append(lastName)
                .toHashCode();
    }
}
