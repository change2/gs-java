class Test
  counter=1
  begin
    file = File.new("test.r1b", 'r')
    while (line = file.gets)
      puts "#{counter}: #{line}"
      counter = counter + 1
    end
    file.close
  rescue => err
    puts "Exception: #{err}"
    err
  end
end