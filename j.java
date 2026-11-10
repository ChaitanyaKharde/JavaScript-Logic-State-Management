studio
  studio

cur = conn.cursor()
cur.execute(f"CREATE TABLE IF NOT EXISTS " + table_name + " (" +
            """ "lot_id"	TEXT NOT NULL,
                "lane_id"	TEXT NOT NULL,
                "spot_id"	TEXT NOT NULL,
                "in_time"	TEXT NOT NULL,
                "out_time"	TEXT
            );""")
conn.commit()
cur.execute(f"CREATE TABLE IF NOT EXISTS " + table_name + " (" +
            """ "lot_id"	TEXT NOT NULL,
                "lane_id"	TEXT NOT NULL,
                "spot_id"	TEXT NOT NULL,
                "in_time"	TEXT NOT NULL,
                "out_time"	TEXT
            );""")
conn.commit()
https://lnkd.in/p/dPjFuSx7
https://lnkd.in/p/dPjFuSx7
