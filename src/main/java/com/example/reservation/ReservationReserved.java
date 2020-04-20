package com.example.reservation;

public class ReservationReserved {
    private Long id;

    private String reservatorName;

    private String reservationDate;

    private String phoneNumber;

    private String eventType;

    public ReservationReserved(Reservation reservation) {
        this.id = reservation.getId();
        this.reservatorName = reservation.getReservatorName();
        this.reservationDate = reservation.getReservationDate();
        this.phoneNumber = reservation.getPhoneNumber();
        this.eventType = ReservationReserved.class.getSimpleName();
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReservatorName() {
        return reservatorName;
    }

    public void setReservatorName(String reservatorName) {
        this.reservatorName = reservatorName;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
