package com.example.testcardslib;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.CompoundButton.OnCheckedChangeListener;
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
	
	boolean mChecked=true;
	
	@Override
    public void setupInnerViewElements(ViewGroup parent, View view) {  
		if (view == null) return;
		Switch mySwitch = (Switch) view.findViewById(R.id.toggle);
		mySwitch.setChecked(mChecked);
		mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
		
			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked) 
					mChecked=true;
                else 
                   mChecked=false;	
			}
  });

    }
	
	@Override
    public int getType() {
        return 0;
    }

}
