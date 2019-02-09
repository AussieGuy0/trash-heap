import requests, bs4, time, os

def create_url(day: int) -> str:
    return 'https://adventofcode.com/2018/day/' + str(day)

for i in range(25, 0, -1):
    res = requests.get(create_url(i))
    res.raise_for_status()
    parsed = bs4.BeautifulSoup(res.text, "lxml")

    desc = parsed.select('article.day-desc')
    dir_name = str(i)


    if not os.path.isdir(dir_name):
        os.mkdir(dir_name)
    
    with open(dir_name + "/README.md", "w+") as f:
        f.write(str(desc))
        f.write("\n") # Add new line at end of file

