package medresourcemanagement;

import java.time.LocalTime;

class TimesAvailaby {

    private LocalTime SundaySt;
    private LocalTime SundayEt;

    private LocalTime MondaySt;
    private LocalTime MondayEt;

    private LocalTime TuesdaySt;
    private LocalTime TuesdayEt;

    private LocalTime WednesdaySt;
    private LocalTime WednesdayEt;

    private LocalTime ThursdaySt;
    private LocalTime ThursdayEt;

    private LocalTime FridaySt;
    private LocalTime FridayEt;

    private LocalTime SaturdaySt;
    private LocalTime SaturdayEt;

    public void setSunTime(String sunInSt, String sunInEt) {
        SundaySt = LocalTime.parse(sunInSt); 
        SundayEt = LocalTime.parse(sunInEt);
    }

    public void setMonTime(String monInSt, String monInEt) {
        MondaySt = LocalTime.parse(monInSt);
        MondayEt = LocalTime.parse(monInEt);
    }

    public void setTueTime(String tueInSt, String tueInEt) {
        TuesdaySt = LocalTime.parse(tueInSt);
        TuesdayEt = LocalTime.parse(tueInEt);
    }

    public void setWedTime(String wedInSt, String wedInEt) {
        WednesdaySt = LocalTime.parse(wedInSt);
        WednesdayEt = LocalTime.parse(wedInEt);
    }

    public void setThuTime(String thuInSt, String thuInEt) {
        ThursdaySt = LocalTime.parse(thuInSt);
        ThursdayEt = LocalTime.parse(thuInEt);
    }

    public void setFriTime(String friInSt, String friInEt) {
        FridaySt = LocalTime.parse(friInSt);
        FridayEt = LocalTime.parse(friInEt);
    }

    public void setSatTime(String satInSt, String satInEt) {
        SaturdaySt = LocalTime.parse(satInSt);
        SaturdayEt = LocalTime.parse(satInEt);
    }
    
    public LocalTime getSunStartTime(){
        return this.SundaySt;
    }
    public LocalTime getSunEndTime(){
        return this.SundayEt;
    }
    public LocalTime getMonStartTime(){
    return this.MondaySt;
}
    public LocalTime getMonEndTime(){
    return this.MondayEt;
}
    public LocalTime getTueStartTime(){
    return this.TuesdaySt;
}
    public LocalTime getTueEndTime(){
    return this.TuesdayEt;
}
    public LocalTime getWedStartTime(){
    return this.WednesdaySt;
}
    public LocalTime getWedEndTime(){
    return this.WednesdayEt;
}
    public LocalTime getThurStartTime(){
    return this.ThursdaySt;
}
    public LocalTime getThursEndTime(){
    return this.ThursdayEt;
}
    public LocalTime getFriStartTime(){
    return this.FridaySt;
}
    public LocalTime getFriEndTime(){
    return this.FridayEt;
}
    public LocalTime getSatStartTime(){
    return this.SaturdaySt;
}
    public LocalTime getSatEndTime(){
    return this.SaturdayEt;
}

}
