package net.hearthstats;

import java.awt.HeadlessException;
import java.net.MalformedURLException;

import net.hearthstats.ui.ClickableDeckBox;

public class DeckUtilsMain {
	public static void main(String[] args) throws HeadlessException,
			MalformedURLException {
		Deck deck = DeckUtils.getDeck(20034);
		System.out.printf("Deck : %s %n", deck);
		ClickableDeckBox.showBox(deck);
	}
}
