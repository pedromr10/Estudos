package exceptions.customExceptions.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut){
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public Date getCheckIn() {
        return checkIn;
    }
    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        //converte de milisegundos para dias:
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut){
        //note que se pegar um exception ele nao continua no codigo, ele volta ao program.java com um exception e nao finaliza o programa
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            throw new IllegalArgumentException("Reservation dates for update must be future dates");
        }
        if(!checkOut.after(checkIn)){
            throw new IllegalArgumentException("Check-out date must be after check-in date");
        }
        //desta maneira, essa seguinte parte do codigo so sera realizada caso nao entre em nenhum if acima
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Room" + roomNumber + ",  chek-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut) + ", " + duration() + " nights";
    }

}
