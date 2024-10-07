package src.view;

import javax.swing.*;
import java.awt.*;

public class TareaView extends JFrame {
    public TareaView(){


       JFrame frame = new JFrame("Tareas");
       frame.setSize(1000,750);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().setBackground(Color.white);
       frame.setLayout(null);


       JPanel tareas = new JPanel();
       tareas.setBounds(0,380,1000,315);
       tareas.setVisible(true);


       JPanel nuevaTarea = new JPanel();
       nuevaTarea.setBounds(0,0,400,380);
       nuevaTarea.setBorder(BorderFactory.createTitledBorder(""));
       nuevaTarea.setLayout(null);
       nuevaTarea.setVisible(true);

       JPanel eliminarTarea = new JPanel();
       eliminarTarea.setBounds(400,0,600,380);
       eliminarTarea.setVisible(true);

       JTextField text = new JTextField();
       text.setBounds(70,20,230,50);
       text.setBackground(Color.white);

       JTextField texto = new JTextField();
       texto.setBounds(70,85,230,50);
       texto.setBackground(Color.white);

       JTextField texti = new JTextField();
       texti.setBounds(70,150,230,50);
       texti.setBackground(Color.white);

       JTextField textu = new JTextField();
       textu.setBounds(70,210,230,50);
       textu.setBackground(Color.white);

       JButton btn = new JButton("Nueva");
       btn.setBackground(Color.gray);
       btn.setBounds(100,270,150,45);

       nuevaTarea.add(btn);
       nuevaTarea.add(textu);
       nuevaTarea.add(texti);
       nuevaTarea.add(texto);
       nuevaTarea.add(text);
       frame.add(eliminarTarea);
       frame.add(nuevaTarea);
       frame.setVisible(true);
       frame.add(tareas);

    }

}
