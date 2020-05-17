public class Room extends Services {
    public String servicesForFree;

    public Room(String servicesForFree) {
        this.servicesForFree = servicesForFree;
    }

    public Room() {
    }

    public String getServicesForFree() {
        return servicesForFree;
    }

    public void setServicesForFree(String servicesForFree) {
        this.servicesForFree = servicesForFree;
    }

    @Override
    public String ShowInfor() {
        return "Services for Free" +servicesForFree;
    }
}
