package data.service;

import org.springframework.data.jpa.repository.JpaRepository;

import data.domain.Children;

public interface ChildrenRepository extends JpaRepository<Children,Long>{

}
