__author__ = 'changejava'
import sqlite3
import sys


if __name__ == '__main__':

    try:
        conn = sqlite3.connect("C:/tools/code/sqlite3/test.db")
        conn.execute("CREATE TABLE IF NOT EXISTS address(id INTEGER  primary key autoincrement ,name varchar(128),address varchar(128))")
        conn.execute("insert into address(name,address) VALUES ('changejava','shanghaipudong')")
        conn.execute("insert into address(name,address) VALUES ('changealice','shanghaipudong')")
        conn.commit()
        cursor = conn.cursor()
        cursor.execute("select * from user")
        res = cursor.fetchall()
        print "user: ", res

        cursor.execute("select * from address")
        res = cursor.fetchall()
        print "address: ", res
    except Exception:
        print 'error %s', sys.exc_info()
    finally:
        cursor.close()
        conn.close()
