D:
cd git_work
cd "Running notes"
echo "# Running-notes" >> README.md
git init
git add README.md
git add .
git commit -m "first commit"
git remote add origin https://github.com/maroom1/Running-notes.git
git push -u origin master
doskey /?
doskey /history >run.bat
