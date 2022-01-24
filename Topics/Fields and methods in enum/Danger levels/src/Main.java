enum DangerLevel {
    
    HIGH(3), MEDIUM(2), LOW(1);

    final int level;

    DangerLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }

}

class Danger {
    
    DangerLevel high = DangerLevel.HIGH;
    DangerLevel medium = DangerLevel.MEDIUM;
    DangerLevel low = DangerLevel.LOW;
    
}
