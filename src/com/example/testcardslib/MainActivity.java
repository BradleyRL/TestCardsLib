package com.example.testcardslib;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardArrayAdapter;
import it.gmariotti.cardslib.library.view.CardListView;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initCards();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private void initCards() {

        ArrayList<Card> cards = new ArrayList<Card>();
        for (int i=0;i<10;i++){
            NewCardSwitch card = new NewCardSwitch(getApplicationContext());
            cards.add(card);  
            //CardSeekbar card2 = new CardSeekbar(getApplicationContext(),i*10);
            //cards.add(card2);  
        }
        
        CardArrayAdapter mCardArrayAdapter = new CardArrayAdapter(getApplicationContext(),cards);
        mCardArrayAdapter.setInnerViewTypeCount(1);

        CardListView listView = (CardListView) findViewById(R.id.carddemo_list_expand);
        if (listView!=null){
            listView.setAdapter(mCardArrayAdapter);
        }
    }
}
