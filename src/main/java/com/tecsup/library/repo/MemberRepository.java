package com.tecsup.library.repo;

import com.tecsup.library.model.Member;
import java.util.Optional;

public interface MemberRepository {
    Optional<Member> findById(String id);
    void save(Member member);
}
