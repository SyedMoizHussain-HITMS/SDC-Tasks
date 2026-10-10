package com.hitms.lms.service;

import com.hitms.lms.exception.BookUnavailableException;
import com.hitms.lms.model.Member;
import java.util.HashMap;
import java.util.Map;

/** Provides operations for the library catalogue and its members. */
public class LibraryService {

    private final Map<String, Member> members = new HashMap<>();

    /** Adds or replaces a member using the member's identifier. */
    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    /** Returns the remaining available-copy count after the book is issued. */
    public int issueBook(int availableCopies, String title) throws BookUnavailableException {
        if (availableCopies <= 0) {
            throw new BookUnavailableException("No copies of \"" + title + "\" are available.");
        }
        return availableCopies - 1;
    }
}
