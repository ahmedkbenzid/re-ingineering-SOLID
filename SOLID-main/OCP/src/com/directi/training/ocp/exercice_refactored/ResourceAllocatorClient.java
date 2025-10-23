package com.directi.training.ocp.exercice_refactored;

public class ResourceAllocatorClient {
    public static void main(String[] args) {
        ResourceAllocator allocator = new ResourceAllocator();

        Resource timeSlot = new TimeSlotResource();
        int timeId = allocator.allocate(timeSlot);
        allocator.free(timeSlot, timeId);

        Resource spaceSlot = new SpaceSlotResource();
        int spaceId = allocator.allocate(spaceSlot);
        allocator.free(spaceSlot, spaceId);
    }
}
