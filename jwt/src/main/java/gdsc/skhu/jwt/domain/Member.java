package gdsc.skhu.jwt.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

// UserDetails 구현
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Member implements UserDetails {
    @Id
    @Column(updatable = false, unique = true, nullable = false)
    private String memberId;

    @Column(nullable = false)
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @Builder.Default
    private List<String> roles = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public String getUsername() {
        return memberId;
    }

    @Override
    public String getPassword() {
        return password;
    }

    // 참고 https://zgundam.tistory.com/49

    // 계정 만료 여부, defalt true
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // 계정 잠김 여부, defalt true
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // 계정 패스워드 만료 여부, defalt true
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // 계정 사용 여부, defalt true
    @Override
    public boolean isEnabled() {
        return true;
    }
}