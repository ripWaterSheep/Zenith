package game.controls;

import util.geometry.Point;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static game.controls.InputVars.*;


public class Input {
    private static KeyAdapter keyAdapter = new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case 65:
                    is_a_pressed = true;
                    break;
                case 66:
                    is_b_pressed = true;
                    break;
                case 67:
                    is_c_pressed = true;
                    break;
                case 68:
                    is_d_pressed = true;
                    break;
                case 69:
                    is_e_pressed = true;
                    break;
                case 70:
                    is_f_pressed = true;
                    break;
                case 71:
                    is_g_pressed = true;
                    break;
                case 72:
                    is_h_pressed = true;
                    break;
                case 73:
                    is_i_pressed = true;
                    break;
                case 74:
                    is_j_pressed = true;
                    break;
                case 75:
                    is_k_pressed = true;
                    break;
                case 76:
                    is_l_pressed = true;
                    break;
                case 77:
                    is_m_pressed = true;
                    break;
                case 78:
                    is_n_pressed = true;
                    break;
                case 79:
                    is_o_pressed = true;
                    break;
                case 80:
                    is_p_pressed = true;
                    break;
                case 81:
                    is_q_pressed = true;
                    break;
                case 82:
                    is_r_pressed = true;
                    break;
                case 83:
                    is_s_pressed = true;
                    break;
                case 84:
                    is_t_pressed = true;
                    break;
                case 85:
                    is_u_pressed = true;
                    break;
                case 86:
                    is_v_pressed = true;
                    break;
                case 87:
                    is_w_pressed = true;
                    break;
                case 88:
                    is_x_pressed = true;
                    break;
                case 89:
                    is_y_pressed = true;
                    break;
                case 90:
                    is_z_pressed = true;
                    break;

            }
        }


        @Override
        public void keyReleased(KeyEvent e) {
            switch (e.getKeyCode()) {
                case 65:
                    is_a_pressed = false;
                    break;
                case 66:
                    is_b_pressed = false;
                    break;
                case 67:
                    is_c_pressed = false;
                    break;
                case 68:
                    is_d_pressed = false;
                    break;
                case 69:
                    is_e_pressed = false;
                    break;
                case 70:
                    is_f_pressed = false;
                    break;
                case 71:
                    is_g_pressed = false;
                    break;
                case 72:
                    is_h_pressed = false;
                    break;
                case 73:
                    is_i_pressed = false;
                    break;
                case 74:
                    is_j_pressed = false;
                    break;
                case 75:
                    is_k_pressed = false;
                    break;
                case 76:
                    is_l_pressed = false;
                    break;
                case 77:
                    is_m_pressed = false;
                    break;
                case 78:
                    is_n_pressed = false;
                    break;
                case 79:
                    is_o_pressed = false;
                    break;
                case 80:
                    is_p_pressed = false;
                    break;
                case 81:
                    is_q_pressed = false;
                    break;
                case 82:
                    is_r_pressed = false;
                    break;
                case 83:
                    is_s_pressed = false;
                    break;
                case 84:
                    is_t_pressed = false;
                    break;
                case 85:
                    is_u_pressed = false;
                    break;
                case 86:
                    is_v_pressed = false;
                    break;
                case 87:
                    is_w_pressed = false;
                    break;
                case 88:
                    is_x_pressed = false;
                    break;
                case 89:
                    is_y_pressed = false;
                    break;
                case 90:
                    is_z_pressed = false;
                    break;
            }
        }
    };


    private static MouseAdapter mouseAdapter = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            switch (e.getButton()) {
                case MouseEvent.BUTTON1:
                    leftClickPoint = new Point(e.getX(), e.getY());
                    break;

                case MouseEvent.BUTTON3:
                    rightClickPoint = new Point(e.getX(), e.getY());

            }
        }
    };


    public static void init(JPanel panel) {
        panel.addMouseListener(mouseAdapter);
        panel.addKeyListener(keyAdapter);
    }

}
