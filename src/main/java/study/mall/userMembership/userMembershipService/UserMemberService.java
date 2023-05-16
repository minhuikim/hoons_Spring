package study.mall.userMembership.userMembershipService;

import study.mall.userMembership.userMembershipDto.Member;

public interface UserMemberService {

    void join(Member member);

    Member findMember(String id);
}
