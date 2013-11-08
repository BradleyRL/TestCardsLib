package com.example.testcardslib;



import it.gmariotti.cardslib.library.internal.CardExpand;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class InfoExpandCard extends CardExpand{

	public InfoExpandCard(Context context) {
		super(context, R.layout.new_help_dialog);		
	}

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {

        if (view == null) return;

        TextView tx1 = (TextView) view.findViewById(R.id.textViewDescription);
        TextView tx2 = (TextView) view.findViewById(R.id.textViewLinkValue);
        
        if (tx1 != null) {
            tx1.setText("Description test");
        }
        
        if (tx2 != null) {
            tx2.setText("TExt 2 test");
        }        
    }
}
