package dw.smaple.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "user")
public class User implements UserDetails {
    @Id
    @Column(name = "user_id",length = 50)
    private String userId;
    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "user_email", length=100)
    private String userEmail;
    @ManyToOne
    @JoinColumn(name = "authority", nullable = false)
    private Authority authority;
    @Enumerated(EnumType.STRING)
    private GenderEnum gender;
    @Column(name = "age", nullable = false, length=11)
    private int age;
    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;
    @Column(name = "date_joined", nullable = false)
    private LocalDateTime dateJoined;

    public enum GenderEnum {
        male,
        female;

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(
                new SimpleGrantedAuthority(authority.getAuthorityName()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userId;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

