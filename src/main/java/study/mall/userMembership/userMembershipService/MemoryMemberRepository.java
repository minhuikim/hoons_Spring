package study.mall.userMembership.userMembershipService;

import study.mall.userMembership.userMembershipDto.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements UserMemberRepository{

    private static Map<String, Member> stroe = new HashMap<>();

    @Override
    public void save(Member member) { stroe.put(member.getUserId(),member);}

    @Override
    public Member findById(String id) { return stroe.get(id);}
}
