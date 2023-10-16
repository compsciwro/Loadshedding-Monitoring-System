class TimeSlot {
    private String startTime;
    private String endTime;
    private String location;

    public TimeSlot(String startTime, String endTime, String location) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getLocation() {
        return location;
    }
}