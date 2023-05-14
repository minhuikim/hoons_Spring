package study.mall.userMembership.userMembershipController;

import org.springframework.stereotype.Controller;
import study.mall.userMembership.userMembershipDto.Member;
import study.mall.userMembership.userMembershipService.UserMembershipService;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserMembershipController {
    Map<String, Member> users = new HashMap<>();
    private UserMembershipService membershipService  ;
    private Member member;

    public void MembershipJoin(){
        String id = "hoon";
        String name = "영훈";
        membershipService.membershipJoin(id,name);
    }
}
