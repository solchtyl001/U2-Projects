import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPGCharacter {
static JTextField name, str, per, end, agi,Int, luc;
static JLabel meleeDamage, health, sneak, spellDamage, mana, dmgRes, spacer;
    /*
    Make a GUI for your RPG Character builder you made in the last Unit. The user should enter primary stats in input box and the GUI
    should display the character's battle stats. The GUI should have at least 4 label, 4 inputs and a button to click which calculates and displays
    the battle stats.
     */

    public static void main(String[] args) {



    JFrame window = new JFrame("RPG junk");
    JPanel panel = new JPanel();
    JButton Calculate = new JButton("calculate stats");
    JLabel input = new JLabel("enter name");
    JLabel input1 = new JLabel("enter strength");
    JLabel input2 = new JLabel("enter perception");
    JLabel input3 = new JLabel("enter endurance");
    JLabel input5 = new JLabel("enter intellignce");
    JLabel input6 = new JLabel("enter luck");
    JLabel input7 = new JLabel("enter agility");
    health = new JLabel("health: ?? ");
    meleeDamage = new JLabel("melee damage: ?? ");
    spellDamage = new JLabel("spell damage: ?? ");
    sneak = new JLabel("sneak: ?? ");
    mana = new JLabel("mana: ?? ");
    dmgRes = new JLabel("Dmg res: ?? ");
    spacer= new JLabel("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");

    name = new JTextField(11);
    str = new JTextField(11);
    per = new JTextField(11);
    end = new JTextField(11);
    Int = new JTextField(11);
    agi = new JTextField(11);
    luc = new JTextField(11);

    window.add(panel);


        panel.add(Calculate);
        panel.add(input);
        panel.add(name);
        panel.add(input1);
        panel.add(str);
        panel.add(input2);
        panel.add(per);
        panel.add(input3);
        panel.add(end);
        panel.add(input5);
        panel.add(Int);
        panel.add(input7);
        panel.add(agi);
        panel.add(input6);
        panel.add(luc);
        panel.add(spacer);
        panel.add(health);
        panel.add(meleeDamage);
        panel.add(spellDamage);
        panel.add(sneak);
        panel.add(mana);
        panel.add(dmgRes);









    window.setSize(700, 200);
    window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.setLocationRelativeTo(null);

    Calculate.addActionListener(new mathJunk());



    }



    public static class mathJunk implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        double strength = Double.parseDouble(str.getText());
        double perception = Double.parseDouble(per.getText());
        double endurance = Double.parseDouble(end.getText());
        double intel = Double.parseDouble(Int.getText());
        double agility = Double.parseDouble(agi.getText());
        double luck = Double.parseDouble(luc.getText());

        health.setText("[ Health: "+ (endurance*3) + "]");
        meleeDamage.setText("[ Melee Damage: " + (strength*2)+"]");
        spellDamage.setText("[ Spell Damage: " + (intel+perception)+"]");
        mana.setText("[ Mana: " + (intel*3)+"]");
        sneak.setText("[ Sneak: " + (agility*2)+"]");
        dmgRes.setText("[ dmgRes: " +(strength+endurance)+"]");








        }
    }
















}
