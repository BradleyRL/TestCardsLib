package com.example.testcardslib;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;

public class SomeOtherCard extends Card{
	
	
	protected String title;
	protected String innertitle;
	protected Context context;
	
	public SomeOtherCard(Context context, String title) {
		super(context, R.layout.some_other_card);
		this.title=title;
		this.context=context;
		this.innertitle=title;
		init();
	}
	
	
	private void init(){				
		CardHeader header = new CardHeader(context);
        header.setTitle(title);        
        header.setButtonExpandVisible(true);
        addCardHeader(header);
        
        InfoExpandCard expand = new InfoExpandCard(context);
        addCardExpand(expand);
        
        
                
    }
	
	
	
	@Override
    public void setupInnerViewElements(ViewGroup parent, View view) {  
		if (view == null) return;
		
        TextView myText = (TextView) view.findViewById(R.id.text);
        myText.setText(innertitle);
        
        setOnClickListener(new Card.OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
            	TextView myText = (TextView) view.findViewById(R.id.text);
                myText.setText("changed text");
                innertitle="changed text";
            }
        });
		
    }

    @Override
    public int getType() {
        return 0;
    }

}
