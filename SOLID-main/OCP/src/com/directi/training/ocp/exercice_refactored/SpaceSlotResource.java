package com.directi.training.ocp.exercice_refactored;

public class SpaceSlotResource implements Resource{
    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private int findFreeSpaceSlot() {
        return 2; // simulation
    }

    private void markSpaceSlotBusy(int resourceId) {
        System.out.println("Space slot " + resourceId + " marked busy");
    }

    private void markSpaceSlotFree(int resourceId) {
        System.out.println("Space slot " + resourceId + " freed");
    }
}
