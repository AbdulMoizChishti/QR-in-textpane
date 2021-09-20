/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qrintext;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
/**
 *
 * @author Abdul Moiz Chishti
 */
public class QRintext {

    /**
     * @param args the command line arguments
     */

  public static void main(String args[]) {
    String title = "abc";
    JFrame frame = new JFrame(title);
    Container content = frame.getContentPane();

    StyleContext context = new StyleContext();
    StyledDocument document = new DefaultStyledDocument(context);
    

    


    // Insert content
   

    // Third style for icon/component
    Style labelStyle = context.getStyle(StyleContext.DEFAULT_STYLE);

    Icon icon = new ImageIcon("C:\\Users\\Abdul Moiz Chishti\\OneDrive - SSUET\\Pictures\\Saved Pictures\\Qr.png");
    JLabel label = new JLabel(icon);
    StyleConstants.setComponent(labelStyle, label);

    // Insert content
    try {
      document.insertString(document.getLength(), "Ignored", labelStyle);
    } catch (BadLocationException badLocationException) {
      System.err.println("Oops");
    }

    JTextPane textPane = new JTextPane(document);
    textPane.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(textPane);
    content.add(scrollPane, BorderLayout.CENTER);

    frame.setSize(300, 150);
    frame.setVisible(true);
  }
}
