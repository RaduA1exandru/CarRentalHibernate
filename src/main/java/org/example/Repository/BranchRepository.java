package org.example.Repository;

import org.example.Model.Branch;

import java.util.List;
import java.util.Optional;

public interface BranchRepository {
    Optional<Branch> findById(int id);
    Optional<Branch>findByIdAndLoadBranches(int id);

    void create (Branch branch);

    void update (Branch branch);

    void delete (Branch branch);

    List<Branch> findAll();
}
