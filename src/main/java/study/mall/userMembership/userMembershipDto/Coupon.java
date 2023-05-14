package study.mall.userMembership.userMembershipDto;

public class Coupon {
    private String couponName;
    private int discount;

    public Coupon(String couponName, int discout) {
        this.couponName = couponName;
        this.discount = discout;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public int getDiscout() {
        return discount;
    }

    public void setDiscout(int discout) {
        this.discount = discout;
    }
}
