package com.example.testcardslib;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;

public class CardSeekbar extends Card{	
	
	
	protected Context context;
	protected int max;
	protected int progress;
	
	
	public CardSeekbar(Context context, int seekBarProgress) {
		super(context, R.layout.card_seekbar);
		this.context=context;
		this.progress=seekBarProgress;		
		init();
	}
	
	
	
	private void init(){		
		
		//Create a CardHeader
        CardHeader header = new CardHeader(context);
        //Set the header title
        header.setTitle("title");      
        //Set visible the expand/collapse button
        header.setButtonExpandVisible(true);
        //Add Header to card
        addCardHeader(header);
        
        InfoExpandCard expand = new InfoExpandCard(context);
        //Add Expand Area to CardC
        addCardExpand(expand);
		
    }
	
	@Override
    public void setupInnerViewElements(ViewGroup parent, View view) {
		
		if (view == null) return;
		final TextView value = (TextView) view.findViewById(R.id.unit);
	    final SeekBar seekBar = (SeekBar) view.findViewById(R.id.seek);
	    if (seekBar != null) {
	    	value.setText(""+progress);
	    	seekBar.setProgress(progress);
	    	seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
	            @Override
	            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
	         	   value.setText(""+i);	         	   
	            }

	            @Override
	            public void onStartTrackingTouch(SeekBar seekBar) {

	            }

	            @Override
	            public void onStopTrackingTouch(final SeekBar seekBar) {
	         	}
	        });

		
		}
    }
	
	
	@Override
    public int getType() {
        return 1;
    }
}
