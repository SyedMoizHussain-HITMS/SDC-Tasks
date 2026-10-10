package com.hitms.lms.service;

import com.hitms.lms.exception.BookUnavailableException;
import com.hitms.lms.model.Member;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/** Provides operations for the library catalogue and its members. */
public class LibraryService {

    private final Map<String, Member> members = new HashMap<>();

    /** Adds or replaces a member using the member's identifier. */
    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    /** Finds a member by identifier, if that member is registered. */
    public Optional<Member> findMemberById(String memberId) {
        return Optional.ofNullable(members.get(memberId));
    }

    /** Returns the available copy count remaining after checkout. */
    public int issueBook(int availableCopies, String title) throws BookUnavailableException {
        if (availableCopies <= 0) {
            throw new BookUnavailableException("No copies of \"" + title + "\" are available.");
        }
        return availableCopies - 1;
    }
}
