package com.example.testcardslib;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;

public class NewCardSwitch extends Card{
	
	protected Boolean create=false;
	protected String title;
	protected Context context;
	
	public NewCardSwitch(Context context, String title) {
		super(context, R.layout.new_card_switch);
		this.title=title;
		this.context=context;
		init();
	}
	
	
	private void init(){				
		CardHeader header = new CardHeader(context);
        header.setTitle(title);        
        header.setButtonExpandVisible(true);
        addCardHeader(header);
        
        InfoExpandCard expand = new InfoExpandCard(context);
        addCardExpand(expand);
        this.create=true;        
    }
	
	
	
	@Override
    public void setupInnerViewElements(ViewGroup parent, View view) {  
		if (view == null) return;
		//if (this.create) {
        Switch mySwitch = (Switch) view.findViewById(R.id.toggle);
        mySwitch.setChecked(create);
        mySwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switch sw= (Switch)v;
                create=sw.isChecked();
            }
        });

		//}
    }

    @Override
    public int getType() {
        return 0;
    }

}
