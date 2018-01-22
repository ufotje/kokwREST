package be.kokw.repositories;

import be.kokw.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<Member,Long>{
}
