package codist.me.readme;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;

import java.text.DateFormat;
import java.util.Calendar;

public class CDatePickerDialog extends DatePickerDialog{
    private Calendar mCalendar;
    private final String format = "EEEE, MMM dd, yyyy";

    public CDatePickerDialog(Context context, OnDateSetListener callBack, int year, int monthOfYear, int dayOfMonth) {
        super(context, callBack, year, monthOfYear, dayOfMonth);
        mCalendar = Calendar.getInstance();
    }

    public CDatePickerDialog(Context context, OnDateSetListener callBack, Calendar calendar) {
        super(context, callBack, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        this.mCalendar = calendar;
    }

    @Override
    public void onDateChanged(DatePicker view, int year, int month, int day) {
        super.onDateChanged(view, year, month, day);
        mCalendar.set(year, month, day);
        // setTitle(DateFormat.format(format, mCalendar));
    }
}
