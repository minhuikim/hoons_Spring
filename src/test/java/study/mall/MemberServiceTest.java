package study.mall;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import study.mall.userMembership.userMembershipDto.Member;
import study.mall.userMembership.userMembershipService.UserMembershipService;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceTest {
    Map<String, Member> users = new HashMap<>();
    private UserMembershipService membershipService  = new UserMembershipService();
    private Member member;
    @Test
    void join() {
        String id = "hoon";
        String name = "영훈";
        Member hoon =membershipService.membershipJoin(id,name);

        Assertions.assertThat(id).isEqualTo(hoon.getUserId());

    }

}
