package com.hitms.lms.model;

/** Represents a registered library member. */
public class Member {

    private final String memberId;
    private final String fullName;

    /** Creates a member with an identifier and full name. */
    public Member(String memberId, String fullName) {
        this.memberId = memberId;
        this.fullName = fullName;
    }

    /** Returns the member's unique identifier. */
    public String getMemberId() {
        return memberId;
    }

    /** Returns the member's full name. */
    public String getFullName() {
        return fullName;
    }
}
