package com.example.dorcas.tictactoe;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class FivebyfiveMainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,reset;
    int turn;
    public static int playerXWon=0,playerOWon=0;
    TextView X_Scores,O_Scores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fivebyfive_main);
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
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b13 = findViewById(R.id.b13);
        b14 = findViewById(R.id.b14);
        b15 = findViewById(R.id.b15);
        b16 = findViewById(R.id.b16);
        b17 = findViewById(R.id.b17);
        b18 = findViewById(R.id.b18);
        b19 = findViewById(R.id.b19);
        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        b24 = findViewById(R.id.b24);
        b25 = findViewById(R.id.b25);
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
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b10.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b10.setText("X");
                        b10.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b10.setText("O");
                        b10.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b11.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b11.setText("X");
                        b11.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b11.setText("O");
                        b11.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b12.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b12.setText("X");
                        b12.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b12.setText("O");
                        b12.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b13.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b13.setText("X");
                        b13.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b13.setText("O");
                        b13.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b14.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b14.setText("X");
                        b14.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b14.setText("O");
                        b14.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b15.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b15.setText("X");
                        b15.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b15.setText("O");
                        b15.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b16.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b16.setText("X");
                        b16.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b16.setText("O");
                        b16.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b17.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b17.setText("X");
                        b17.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b17.setText("O");
                        b17.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b18.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b18.setText("X");
                        b18.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b18.setText("O");
                        b18.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b19.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b19.setText("X");
                        b19.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b19.setText("O");
                        b19.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b20.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b20.setText("X");
                        b20.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b20.setText("O");
                        b20.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b21.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b21.setText("X");
                        b21.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b21.setText("O");
                        b21.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b22.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b22.setText("X");
                        b22.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b22.setText("O");
                        b22.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b23.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b23.setText("X");
                        b23.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b23.setText("O");
                        b23.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b24.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b24.setText("X");
                        b24.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b24.setText("O");
                        b24.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b25.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b25.setText("X");
                        b25.setTextColor(Color.parseColor("#4286f4"));
                    } else if (turn == 2) {
                        turn = 1;
                        b25.setText("O");
                        b25.setTextColor(Color.parseColor("#e27414"));
                    }
                }
                endGame();
            }
        });

    }
    public void endGame() {
        String a, b, c, d, e, f, g, h, i, j, k, l, m,n,o,p,q,r,s,t,u,v,w,x,y;
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
        j = b10.getText().toString();
        k = b11.getText().toString();
        l = b12.getText().toString();
        m = b13.getText().toString();
        n = b14.getText().toString();
        o = b15.getText().toString();
        p = b16.getText().toString();
        q = b17.getText().toString();
        r = b18.getText().toString();
        s = b19.getText().toString();
        t = b20.getText().toString();
        u = b21.getText().toString();
        v = b22.getText().toString();
        w = b23.getText().toString();
        x = b24.getText().toString();
        y = b25.getText().toString();
        if (a.equals("X") && b.equals("X") && c.equals("X") && d.equals("X") && e.equals("X")) {
            Toast.makeText(this, "X is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerXWon++;
        }
        if (a.equals("X") && g.equals("X") && m.equals("X") && s.equals("X") && y.equals("X")) {
            Toast.makeText(this, "X is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerXWon++;
        }
        if (a.equals("X") && f.equals("X") && k.equals("X") && p.equals("X") && u.equals("X")) {
            Toast.makeText(this, "X is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerXWon++;
        }
        if (b.equals("X") && g.equals("X") && l.equals("X") && q.equals("X") && v.equals("X")) {
            Toast.makeText(this, "X is Winner", Toast.LENGTH_SHORT).show();
            end = true;
        }
        if (c.equals("X") && h.equals("X") && m.equals("X") && r.equals("X") && w.equals("X")) {
            Toast.makeText(this, "X is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerXWon++;
        }
        if (d.equals("X") && i.equals("X") && n.equals("X") && s.equals("X") && x.equals("X")) {
            Toast.makeText(this, "X is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerXWon++;
        }
        if (e.equals("X") && j.equals("X") && o.equals("X") && t.equals("X") && y.equals("X")) {
            Toast.makeText(this, "X is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerXWon++;
        }
        if (f.equals("X") && g.equals("X") && h.equals("X") && i.equals("X") && j.equals("X")) {
            Toast.makeText(this, "X is Winner", Toast.LENGTH_SHORT).show();
            end = true;
        }
        if (k.equals("X") && l.equals("X") && m.equals("X") && n.equals("X") && o.equals("X")) {
            Toast.makeText(this, "X is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerXWon++;
        }
        if (p.equals("X") && q.equals("X") && r.equals("X") && s.equals("X") && t.equals("X")) {
            Toast.makeText(this, "X is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerXWon++;
        }
        if (u.equals("X") && v.equals("X") && w.equals("X") && x.equals("X") && y.equals("X")) {
            Toast.makeText(this, "X is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerXWon++;
        }
        if (e.equals("X") && i.equals("X") && m.equals("X") && q.equals("X") && u.equals("X")) {
            Toast.makeText(this, "X is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerXWon++;
        }



        if (a.equals("O") && b.equals("O") && c.equals("O") && d.equals("O") && e.equals("O")) {
            Toast.makeText(this, "O is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerOWon++;
        }
        if (a.equals("O") && g.equals("O") && m.equals("O") && s.equals("O") && y.equals("O")) {
            Toast.makeText(this, "O is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerOWon++;
        }
        if (a.equals("O") && f.equals("O") && k.equals("O") && p.equals("O") && u.equals("O")) {
            Toast.makeText(this, "O is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerOWon++;
        }
        if (b.equals("O") && g.equals("O") && l.equals("O") && q.equals("O") && v.equals("O")) {
            Toast.makeText(this, "O is Winner", Toast.LENGTH_SHORT).show();
            end = true;
        }
        if (c.equals("O") && h.equals("O") && m.equals("O") && r.equals("O") && w.equals("O")) {
            Toast.makeText(this, "O is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerOWon++;
        }
        if (d.equals("O") && i.equals("O") && n.equals("O") && s.equals("O") && x.equals("O")) {
            Toast.makeText(this, "O is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerOWon++;
        }
        if (e.equals("O") && j.equals("O") && o.equals("O") && t.equals("O") && y.equals("O")) {
            Toast.makeText(this, "O is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerOWon++;
        }
        if (f.equals("O") && g.equals("O") && h.equals("O") && i.equals("O") && j.equals("O")) {
            Toast.makeText(this, "O is Winner", Toast.LENGTH_SHORT).show();
            end = true;
        }
        if (k.equals("O") && l.equals("O") && m.equals("O") && n.equals("O") && o.equals("O")) {
            Toast.makeText(this, "O is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerOWon++;
        }
        if (p.equals("O") && q.equals("O") && r.equals("O") && s.equals("O") && t.equals("O")) {
            Toast.makeText(this, "O is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerOWon++;
        }
        if (u.equals("O") && v.equals("O") && w.equals("O") && x.equals("O") && y.equals("O")) {
            Toast.makeText(this, "O is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerOWon++;
        }
        if (e.equals("O") && i.equals("O") && m.equals("O") && q.equals("O") && u.equals("O")) {
            Toast.makeText(this, "O is Winner", Toast.LENGTH_SHORT).show();
            end = true;
            playerOWon++;
        }


        if(end){
            //set Scores
            X_Scores.setText(""+playerXWon);
            O_Scores.setText(""+playerOWon);;
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            b10.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);
            b17.setEnabled(false);
            b18.setEnabled(false);
            b19.setEnabled(false);
            b20.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
            b24.setEnabled(false);
            b25.setEnabled(false);
        }
    }
    //reset game
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
        b10.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b14.setEnabled(true);
        b15.setEnabled(true);
        b16.setEnabled(true);
        b17.setEnabled(true);
        b18.setEnabled(true);
        b19.setEnabled(true);
        b20.setEnabled(true);
        b21.setEnabled(true);
        b22.setEnabled(true);
        b23.setEnabled(true);
        b24.setEnabled(true);
        b25.setEnabled(true);
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
        b10.setText("");
        b11.setText("");
        b12.setText("");
        b13.setText("");
        b14.setText("");
        b15.setText("");
        b16.setText("");
        b17.setText("");
        b18.setText("");
        b19.setText("");
        b20.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b24.setText("");
        b25.setText("");

        startgame();
    }
}

