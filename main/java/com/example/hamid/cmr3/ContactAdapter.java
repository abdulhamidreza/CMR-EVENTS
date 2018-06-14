package com.example.hamid.cmr3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<Contact> {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;
    public ContactAdapter(Context context, ArrayList<Contact> contacts, int colorResourceId) {
        super(context, 0, contacts);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.help_list_item, parent, false);
        }

        Contact currentContact = getItem(position);
        
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentContact.getName());

        TextView degiTextView = (TextView) listItemView.findViewById(R.id.degi_text_view);
      String  num=currentContact.getNum();
      String degi=currentContact.getWho();
        degiTextView.setText(degi+"   "+num);

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not

        if (currentContact.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentContact.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}