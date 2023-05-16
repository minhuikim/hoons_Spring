package study.mall.userMembership.userMembershipService;

import study.mall.userMembership.userMembershipDto.Member;

public interface UserMemberRepository {

    void save(Member member);

    Member findById(String id);
}
