package com.example.practica3;

import com.example.practica3.entities.Reserve;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Utils {

    public static Reserve lastReserve(List<Reserve> reserves) {

        if (reserves.isEmpty()) {
            return null; // Si la lista está vacía, retorna null
        }

        Reserve lastReserve = reserves.get(0);
        for (Reserve reserve : reserves) {
            if (reserve.getReserved_at().after(lastReserve.getReserved_at())) {
                lastReserve = reserve;
            }
        }
        return lastReserve;
    }

    public static int countReserveLastMonth(List<Reserve> reserves) {
        Calendar calendar = Calendar.getInstance(); // Obtener una instancia de Calendar
        calendar.setTime(new Date()); // Establecer la fecha actual en el Calendar

        int currentMonth = calendar.get(Calendar.MONTH); // Obtener el mes actual
        int lastMonth = (currentMonth - 1 + 12) % 12; // Calcular el mes pasado teniendo en cuenta los meses del año

        int count = 0;

        for (Reserve reserve : reserves) {
            calendar.setTime(reserve.getReserved_at()); // Establecer la fecha de reserva en el Calendar
            int reserveMonth = calendar.get(Calendar.MONTH); // Obtener el mes de la reserva

            if (reserveMonth == lastMonth) {
                count++; // Incrementar el contador si la reserva es del mes pasado
            }
        }

        return count;
    }

}
