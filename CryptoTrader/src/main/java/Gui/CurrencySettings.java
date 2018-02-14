package Gui;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencySettings {
    public JPanel Settings_Outter;
    private JButton button_Account;
    private JButton button_Main;
    private JButton button_Settings;
    private JPanel content;
    private JPanel content_Home;
    private JTextField textField_CurrencySettings;
    public JCheckBox bitCoinCheckBox;
    public JCheckBox cardanoCheckBox;
    public JCheckBox binanceCheckBox;
    public JCheckBox litecoinCheckBox;
    public JCheckBox TRXCheckBox;
    public JCheckBox ICXCheckBox;
    public JCheckBox NEOCheckBox;
    public JCheckBox VENCheckBox;
    public JCheckBox ETCCheckBox;
    public JCheckBox XRPCheckBox;
    public JCheckBox ETHCheckBox;

    //vars that are passed to GUITest


    public CurrencySettings() {

        //init stuff


        button_Main.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //set which screens
                GUITest.switchScreens("home");
            }
        });
        button_Account.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //set which screens
                GUITest.switchScreens("account");
            }
        });
    }

    //getters and setters
    public JCheckBox getBitCoinCheckBox() {
        return bitCoinCheckBox;
    }

    public void setBitCoinCheckBox(JCheckBox bitCoinCheckBox) {
        this.bitCoinCheckBox = bitCoinCheckBox;
    }

    public JCheckBox getCardanoCheckBox() {
        return cardanoCheckBox;
    }

    public void setCardanoCheckBox(JCheckBox cardanoCheckBox) {
        this.cardanoCheckBox = cardanoCheckBox;
    }

    public JCheckBox getBinanceCheckBox() {
        return binanceCheckBox;
    }

    public void setBinanceCheckBox(JCheckBox binanceCheckBox) {
        this.binanceCheckBox = binanceCheckBox;
    }

    public JCheckBox getLitecoinCheckBox() {
        return litecoinCheckBox;
    }

    public void setLitecoinCheckBox(JCheckBox litecoinCheckBox) {
        this.litecoinCheckBox = litecoinCheckBox;
    }

    public JCheckBox getTRXCheckBox() {
        return TRXCheckBox;
    }

    public JCheckBox getICXCheckBox() {
        return ICXCheckBox;
    }

    public JCheckBox getNEOCheckBox() {
        return NEOCheckBox;
    }

    public JCheckBox getVENCheckBox() {
        return VENCheckBox;
    }

    public JCheckBox getETCCheckBox() {
        return ETCCheckBox;
    }

    public JCheckBox getXRPCheckBox() {
        return XRPCheckBox;
    }

    public JCheckBox getETHCheckBox() {
        return ETHCheckBox;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        Settings_Outter = new JPanel();
        Settings_Outter.setLayout(new GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));
        Settings_Outter.setBackground(new Color(-16747077));
        Settings_Outter.setForeground(new Color(-16747077));
        Settings_Outter.setMinimumSize(new Dimension(1280, 720));
        Settings_Outter.setPreferredSize(new Dimension(1280, 720));
        final Spacer spacer1 = new Spacer();
        Settings_Outter.add(spacer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        button_Account = new JButton();
        button_Account.setBackground(new Color(-16747077));
        Font button_AccountFont = this.$$$getFont$$$("Khmer OS", Font.PLAIN, 30, button_Account.getFont());
        if (button_AccountFont != null) button_Account.setFont(button_AccountFont);
        button_Account.setForeground(new Color(-16777216));
        button_Account.setText("Account");
        Settings_Outter.add(button_Account, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 255), null, 0, false));
        button_Main = new JButton();
        button_Main.setBackground(new Color(-16747077));
        Font button_MainFont = this.$$$getFont$$$("Khmer OS", Font.PLAIN, 30, button_Main.getFont());
        if (button_MainFont != null) button_Main.setFont(button_MainFont);
        button_Main.setForeground(new Color(-16777216));
        button_Main.setText("Home");
        Settings_Outter.add(button_Main, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 225), null, 0, false));
        button_Settings = new JButton();
        button_Settings.setBackground(new Color(-16752483));
        Font button_SettingsFont = this.$$$getFont$$$("Khmer OS", Font.PLAIN, 30, button_Settings.getFont());
        if (button_SettingsFont != null) button_Settings.setFont(button_SettingsFont);
        button_Settings.setForeground(new Color(-16777216));
        button_Settings.setText("Settings");
        Settings_Outter.add(button_Settings, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 225), null, 0, false));
        content = new JPanel();
        content.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        Settings_Outter.add(content, new GridConstraints(1, 1, 3, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        content_Home = new JPanel();
        content_Home.setLayout(new GridLayoutManager(7, 5, new Insets(0, 0, 0, 0), -1, -1));
        content_Home.setBackground(new Color(-9079691));
        content_Home.setEnabled(true);
        content_Home.setVisible(true);
        content.add(content_Home, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        content_Home.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(-16777216)), null));
        textField_CurrencySettings = new JTextField();
        textField_CurrencySettings.setBackground(new Color(-9079691));
        textField_CurrencySettings.setEditable(false);
        Font textField_CurrencySettingsFont = this.$$$getFont$$$("Khmer OS", Font.BOLD, 48, textField_CurrencySettings.getFont());
        if (textField_CurrencySettingsFont != null) textField_CurrencySettings.setFont(textField_CurrencySettingsFont);
        textField_CurrencySettings.setForeground(new Color(-4473925));
        textField_CurrencySettings.setText("Currency Settings");
        content_Home.add(textField_CurrencySettings, new GridConstraints(0, 0, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final Spacer spacer2 = new Spacer();
        content_Home.add(spacer2, new GridConstraints(1, 4, 6, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        cardanoCheckBox = new JCheckBox();
        cardanoCheckBox.setBackground(new Color(-9079691));
        Font cardanoCheckBoxFont = this.$$$getFont$$$("Khmer OS", Font.PLAIN, 36, cardanoCheckBox.getFont());
        if (cardanoCheckBoxFont != null) cardanoCheckBox.setFont(cardanoCheckBoxFont);
        cardanoCheckBox.setText("ADA");
        content_Home.add(cardanoCheckBox, new GridConstraints(5, 0, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        TRXCheckBox = new JCheckBox();
        TRXCheckBox.setBackground(new Color(-9079691));
        Font TRXCheckBoxFont = this.$$$getFont$$$("Khmer OS", Font.PLAIN, 36, TRXCheckBox.getFont());
        if (TRXCheckBoxFont != null) TRXCheckBox.setFont(TRXCheckBoxFont);
        TRXCheckBox.setText("TRX");
        content_Home.add(TRXCheckBox, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ICXCheckBox = new JCheckBox();
        ICXCheckBox.setBackground(new Color(-9079691));
        Font ICXCheckBoxFont = this.$$$getFont$$$("Khmer OS", Font.PLAIN, 36, ICXCheckBox.getFont());
        if (ICXCheckBoxFont != null) ICXCheckBox.setFont(ICXCheckBoxFont);
        ICXCheckBox.setText("ICX");
        content_Home.add(ICXCheckBox, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        VENCheckBox = new JCheckBox();
        VENCheckBox.setBackground(new Color(-9079691));
        Font VENCheckBoxFont = this.$$$getFont$$$("Khmer OS", Font.PLAIN, 36, VENCheckBox.getFont());
        if (VENCheckBoxFont != null) VENCheckBox.setFont(VENCheckBoxFont);
        VENCheckBox.setText("VEN");
        content_Home.add(VENCheckBox, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        XRPCheckBox = new JCheckBox();
        XRPCheckBox.setBackground(new Color(-9079691));
        Font XRPCheckBoxFont = this.$$$getFont$$$("Khmer OS", Font.PLAIN, 36, XRPCheckBox.getFont());
        if (XRPCheckBoxFont != null) XRPCheckBox.setFont(XRPCheckBoxFont);
        XRPCheckBox.setText("XRP");
        content_Home.add(XRPCheckBox, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        binanceCheckBox = new JCheckBox();
        binanceCheckBox.setBackground(new Color(-9079691));
        Font binanceCheckBoxFont = this.$$$getFont$$$("Khmer OS", Font.PLAIN, 36, binanceCheckBox.getFont());
        if (binanceCheckBoxFont != null) binanceCheckBox.setFont(binanceCheckBoxFont);
        binanceCheckBox.setText("BNB");
        content_Home.add(binanceCheckBox, new GridConstraints(5, 2, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ETHCheckBox = new JCheckBox();
        ETHCheckBox.setBackground(new Color(-9079691));
        Font ETHCheckBoxFont = this.$$$getFont$$$("Khmer OS", Font.PLAIN, 36, ETHCheckBox.getFont());
        if (ETHCheckBoxFont != null) ETHCheckBox.setFont(ETHCheckBoxFont);
        ETHCheckBox.setText("ETH");
        content_Home.add(ETHCheckBox, new GridConstraints(4, 2, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ETCCheckBox = new JCheckBox();
        ETCCheckBox.setBackground(new Color(-9079691));
        Font ETCCheckBoxFont = this.$$$getFont$$$("Khmer OS", Font.PLAIN, 36, ETCCheckBox.getFont());
        if (ETCCheckBoxFont != null) ETCCheckBox.setFont(ETCCheckBoxFont);
        ETCCheckBox.setText("ETC");
        content_Home.add(ETCCheckBox, new GridConstraints(3, 2, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        NEOCheckBox = new JCheckBox();
        NEOCheckBox.setBackground(new Color(-9079691));
        Font NEOCheckBoxFont = this.$$$getFont$$$("Khmer OS", Font.PLAIN, 36, NEOCheckBox.getFont());
        if (NEOCheckBoxFont != null) NEOCheckBox.setFont(NEOCheckBoxFont);
        NEOCheckBox.setText("NEO");
        content_Home.add(NEOCheckBox, new GridConstraints(2, 2, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        litecoinCheckBox = new JCheckBox();
        litecoinCheckBox.setBackground(new Color(-9079691));
        Font litecoinCheckBoxFont = this.$$$getFont$$$("Khmer OS", Font.PLAIN, 36, litecoinCheckBox.getFont());
        if (litecoinCheckBoxFont != null) litecoinCheckBox.setFont(litecoinCheckBoxFont);
        litecoinCheckBox.setText("LTC");
        content_Home.add(litecoinCheckBox, new GridConstraints(1, 2, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return Settings_Outter;
    }
}
