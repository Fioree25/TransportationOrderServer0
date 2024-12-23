package es.upm.dit.apsv.transportationorderserver.model;

import javax.persistence.Entity;
import javax.persistence.Id;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;
// import lombok.ToString;

@Entity
// @Getter @Setter @NoArgsConstructor @ToString
public class TransportationOrder {
    private String toid;
    @Id
    private String truck;
    private long originDate;
    private double originLat;
    private double originLong;
    private long dstDate;
    private double dstLat;
    private double dstLong;
    private long lastDate;
    private double lastLat;
    private double lastLong;
    private int st;

    public String getToid() {
        return toid;
    }
    public String getTruck() {
        return truck;
    }
    public long getOriginDate() {
        return originDate;
    }
    public double getOriginLat() {
        return originLat;
    }
    public double getOriginLong() {
        return originLong;
    }
    public long getDstDate() {
        return dstDate;
    }
    public double getDstLat() {
        return dstLat;
    }
    public double getDstLong() {
        return dstLong;
    }
    public long getLastDate() {
        return lastDate;
    }
    public double getLastLat() {
        return lastLat;
    }
    public double getLastLong() {
        return lastLong;
    }
    public int getSt() {
        return st;
    }

    public void setToid(String toid) {
        this.toid = toid;
    }
    public void setTruck(String truck) {
        this.truck = truck;
    }
    public void setOriginDate(long originDate) {
        this.originDate = originDate;
    }
    public void setOriginLat(double originLat) {
        this.originLat = originLat;
    }
    public void setOriginLong(double originLong) {
        this.originLong = originLong;
    }
    public void setDstDate(long dstDate) {
        this.dstDate = dstDate;
    }
    public void setDstLat(double dstLat) {
        this.dstLat = dstLat;
    }
    public void setDstLong(double dstLong) {
        this.dstLong = dstLong;
    }
    public void setLastDate(long lastDate) {
        this.lastDate = lastDate;
    }
    public void setLastLat(double lastLat) {
        this.lastLat = lastLat;
    }
    public void setLastLong(double lastLong) {
        this.lastLong = lastLong;
    }
    public void setSt(int st) {
        this.st = st;
    }

    public TransportationOrder() {
    }
    
    public TransportationOrder(String toid, String truck, long originDate, double originLat, double originLong,
            long dstDate, double dstLat, double dstLong, long lastDate, double lastLat, double lastLong, int st) {
        this.toid = toid;
        this.truck = truck;
        this.originDate = originDate;
        this.originLat = originLat;
        this.originLong = originLong;
        this.dstDate = dstDate;
        this.dstLat = dstLat;
        this.dstLong = dstLong;
        this.lastDate = lastDate;
        this.lastLat = lastLat;
        this.lastLong = lastLong;
        this.st = st;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((truck == null) ? 0 : truck.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TransportationOrder other = (TransportationOrder) obj;
        if (truck == null) {
            if (other.truck != null)
                return false;
        } else if (!truck.equals(other.truck))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "TransportationOrder [toid=" + toid + ", truck=" + truck + ", originDate=" + originDate + ", originLat="
                + originLat + ", originLong=" + originLong + ", dstDate=" + dstDate + ", dstLat=" + dstLat
                + ", dstLong=" + dstLong + ", lastDate=" + lastDate + ", lastLat=" + lastLat + ", lastLong=" + lastLong
                + ", st=" + st + "]";
    }
    
    public double distanceToDestination() {
        return Math.sqrt(Math.pow(this.dstLat -this.lastLat, 2) + Math.pow(this.dstLong - this.lastLong, 2));
    }
}
