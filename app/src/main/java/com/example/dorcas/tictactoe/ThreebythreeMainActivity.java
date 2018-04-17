package com.example.dorcas.tictactoe;
        import android.support.v7.app.AppCompatActivity;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;
public class ThreebythreeMainActivity extends AppCompatActivity {
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9,reset;
    int turn;
    private static int playerXWon=0,playerOWon=0;
    private TextView X_Scores,O_Scores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threebythree_main);

        X_Scores = findViewById(R.id.X_Scores);
        O_Scores = findViewById(R.id.O_Scores);
        X_Scores.setText(""+0);
        O_Scores.setText(""+0);
        reset= findViewById(R.id.btn_reset);


        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        turn = 1;
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //restart game
                reset();
            }
        });
        startgame();


    }
    public void startgame()
    {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                        b1.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                        b1.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                        b2.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                        b2.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                        b3.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                        b3.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                        b4.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                        b4.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                        b5.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                        b5.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                        b6.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                        b6.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                        b7.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                        b7.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                        b8.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                        b8.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                        b9.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                        b9.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
    }
    public void endGame() {
        String a, b, c, d, e, f, g, h, i;
        boolean end = false;
        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();
        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(this, "X is winner", Toast.LENGTH_SHORT).show();
            playerXWon++;
            end = true;
        }
        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(this, "X is winner", Toast.LENGTH_SHORT).show();
            playerXWon++;
            end = true;
        }
        if (a.equals("X") && d.equals("X") && g.equals("X")){
            Toast.makeText(this, "X is winner", Toast.LENGTH_SHORT).show();
            playerXWon++;
            end = true;
        }
        if (d.equals("X") && e.equals("X") && f.equals("X"))  {
            Toast.makeText(this, "X is winner", Toast.LENGTH_SHORT).show();
            playerXWon++;
            end = true;
        }
        if (b.equals("X") && e.equals("X") && h.equals("X"))  {
            Toast.makeText(this, "X is winner", Toast.LENGTH_SHORT).show();
            playerXWon++;
            end = true;
        }
        if (c.equals("X") && f.equals("X") && i.equals("X"))  {
            Toast.makeText(this, " X is winner", Toast.LENGTH_SHORT).show();
            playerXWon++;
            end = true;
        }
        if (g.equals("X") && h.equals("X") && i.equals("X"))  {
            Toast.makeText(this, "X is winner", Toast.LENGTH_SHORT).show();
            playerXWon++;
            end = true;
        }
        if (c.equals("X") && e.equals("X") && g.equals("X"))  {
            Toast.makeText(this, "X is winner", Toast.LENGTH_SHORT).show();
            playerXWon++;
            end = true;
        }
        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(this, "O is winner", Toast.LENGTH_SHORT).show();
            playerOWon++;
            end = true;
        }
        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(this, "O is winner", Toast.LENGTH_SHORT).show();
            playerOWon++;
            end = true;
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")){
            Toast.makeText(this, "O is winner", Toast.LENGTH_SHORT).show();
            playerOWon++;
            end = true;
        }
        if (d.equals("O") && e.equals("O") && f.equals("O"))  {
            Toast.makeText(this, "O is winner", Toast.LENGTH_SHORT).show();
            playerOWon++;
            end = true;
        }
        if (b.equals("O") && e.equals("O") && h.equals("O"))  {
            Toast.makeText(this, "O is winner", Toast.LENGTH_SHORT).show();
            playerOWon++;
            end = true;
        }
        if (c.equals("O") && f.equals("O") && i.equals("O"))  {
            Toast.makeText(this, "O is winner", Toast.LENGTH_SHORT).show();
            playerOWon++;
            end = true;
        }
        if (g.equals("O") && h.equals("O") && i.equals("O"))  {
            Toast.makeText(this, "O is winner", Toast.LENGTH_SHORT).show();
            playerOWon++;
            end = true;
        }
        if (c.equals("O") && e.equals("O") && g.equals("O"))  {
            Toast.makeText(this, "O is winner", Toast.LENGTH_SHORT).show();
            playerOWon++;
            end = true;
        }

        if(end){
            //set scores when game ends
            X_Scores.setText(""+playerXWon);
            O_Scores.setText(""+playerOWon);

            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }


    }

    public void reset()
    {
        //enable buttons
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

        //unset the buttons
        //clear there content
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }
}
