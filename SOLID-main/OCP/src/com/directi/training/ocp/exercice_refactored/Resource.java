package com.directi.training.ocp.exercice_refactored;

public interface Resource {
    int allocate();
    void free(int resourceId);
}
