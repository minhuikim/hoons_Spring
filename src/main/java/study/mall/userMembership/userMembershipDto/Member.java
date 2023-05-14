package study.mall.userMembership.userMembershipDto;

public class Member {
    private String userId;
    private String name;

    public Member(String id,String name){
        this.userId= id;
        this.name= name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
