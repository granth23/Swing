package Collections;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class Collections extends JFrame {
    int selectedCollection=0;
    JTable jt;
    DefaultTableModel model;

    public Collections(){

        this.setTitle("Java Collection");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLayout(null);

        JTextField valTF = new JTextField();
        valTF.setEnabled(false);
        JTextField keyTF = new JTextField();
        keyTF.setEnabled(false);

        JButton addBtn = new JButton("ADD");
        addBtn.setEnabled(false);
        JButton editBtn = new JButton("EDIT");
        editBtn.setEnabled(false);
        JButton delBtn = new JButton("DEL");
        delBtn.setEnabled(false);

        JComboBox sel = new JComboBox();
        sel.addItem("Select a Collection");
        sel.addItem("ArrayList");
        sel.addItem("HashMap");

        sel.setBounds(30, 30, 240, 30);
        this.add(sel);

        sel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                selectedCollection = sel.getSelectedIndex();
            }
        });

        JButton freezeOption = new JButton("Freeze Collection");
        freezeOption.setBounds(30, 80, 240, 30);
        this.add(freezeOption);

        JLabel keyLbl = new JLabel("Key: ");
        JLabel valLbl = new JLabel("Value: ");
        keyLbl.setBounds(30, 130, 50, 30);
        keyTF.setBounds(90, 130, 180, 30);
        valLbl.setBounds(30, 180, 50, 30);
        valTF.setBounds(90, 180, 180, 30);

        addBtn.setBounds(30, 230, 74, 30);
        editBtn.setBounds(113, 230, 74, 30);
        delBtn.setBounds(196, 230, 74, 30);

        this.add(keyLbl);
        this.add(keyTF);
        this.add(valLbl);
        this.add(valTF);
        this.add(addBtn);
        this.add(delBtn);
        this.add(editBtn);

        model = new DefaultTableModel();
        model.addColumn("Key");
        model.addColumn("Value");
        jt = new JTable(model);

        jt.setBounds(20, 20, 300, 2000);
        JScrollPane js = new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        js.setBounds(300, 30, 340, 370);
        this.add(js);

        freezeOption.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                sel.setEnabled(false);
                valTF.setEnabled(true);
                if(selectedCollection==2){
                    keyTF.setEnabled(true);
                }
                addBtn.setEnabled(true);
                editBtn.setEnabled(true);
                delBtn.setEnabled(true);
            }
        });

        addBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                if(selectedCollection==1){
                    model.addRow(new Object[] {model.getRowCount()+1, valTF.getText()});
                }
                else{
                    model.addRow(new Object[] {keyTF.getText(), valTF.getText()});
                }
            }
        });

        delBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                if(selectedCollection==1){
                    model.removeRow(jt.getSelectedRow());
                }
                else{
                    model.removeRow(jt.getSelectedRow());
                }
            }
        });

        editBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                if(selectedCollection==1){
                    int row = jt.getSelectedRow();
                    model.setValueAt(valTF.getText(), row, 1);
                }
                else{
                    int row = jt.getSelectedRow();
                    model.setValueAt(keyTF.getText(), row, 0);
                    model.setValueAt(valTF.getText(), row, 1);
                }
            }
        });

        this.setBounds(40, 40, 680, 480);
        this.setVisible(true);

    }
}
