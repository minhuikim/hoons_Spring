package study.mall.userMembership.userMembershipService;

import study.mall.userMembership.userMembershipDto.Member;
import study.mall.userMembership.userMembershipMapper.UserMembershipMapper;


public class UserMembershipService {
    UserMembershipMapper mapper = new UserMembershipMapper();
    //회원가입
    public Member membershipJoin(String id, String name) {
        //신규유저인지 확인
        System.out.println("join서비스");
        int check = mapper.checkUser(id);

        //유저정보가 없을때 (신규 유저일때)
        if (check == 0) {
            mapper.insertUser(id, name);
            mapper.insertCoupon(id);
            Member unknown = new Member(id, name);
            System.out.println(unknown.getUserId());
            return unknown;
        }else { //정보가있고 회원탈퇴했을경우
            return  null;
        } //정보가있고 사용하는경우

    }
}
