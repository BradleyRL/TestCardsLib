package com.example.testcardslib;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;

public class NewCardSwitch extends Card{	
	
	public NewCardSwitch(Context context) {
		this(context, R.layout.new_card_switch);		
	}
	
	public NewCardSwitch(Context context, int innerLayout) {
        super(context, innerLayout);
        init(context);
    }
	
	private void init(Context context){				
		CardHeader header = new CardHeader(context);
        header.setTitle("title");        
        header.setButtonExpandVisible(true);
        addCardHeader(header);
        
        InfoExpandCard expand = new InfoExpandCard(context);
        addCardExpand(expand);
                
    }
	
	@Override
    public void setupInnerViewElements(ViewGroup parent, View view) {       
    }
	
	@Override
    public int getType() {
        return 0;
    }

}
