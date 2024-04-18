FROM python

WORKDIR /work

COPY ./main.py .

CMD [ "python", "main.py" ]