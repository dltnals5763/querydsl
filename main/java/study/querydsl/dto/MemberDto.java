package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
public class MemberDto {
    private String username;
    private int age;

    @QueryProjection
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
